package com.aspose.barcode.auxiliary;

import org.apache.commons.io.FilenameUtils;

import java.io.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PHPBridgeTestsAssist
{
    public static void printResults(Process process) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = "";
        while ((line = reader.readLine()) != null)
        {
            System.out.println(line);
        }
    }
    public static List<String> runProcessInDirectory(String processName, String directory, String[] commandArray)
    {
        List<String> commandList = Arrays.asList(commandArray.clone());
        return runProcessInDirectory(processName, directory, commandList);
    }
    //Python uses this
    public static List<String> runProcessInDirectory(String processName, String directoryName, List<String> commandList)
    {
        StringBuffer commandLine = new StringBuffer();
        for (String s : commandList)
        {
            commandLine.append(s).append(" ");
        }
        System.out.println("\n### Launch " + processName + ".\nCommand to run: '" + commandLine + "'");
        List<String> accumulatedLog = new ArrayList<>();
        try
        {
            System.out.println("### Process log:");
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command(commandList);
            File dir = new File(directoryName);
            processBuilder.directory(dir);
            Process p = processBuilder.start();
            inheritIO(p.getInputStream(), System.out, accumulatedLog);
            accumulatedLog = inheritIO(p.getErrorStream(), System.err, accumulatedLog);
            p.waitFor();
        }
        catch (Exception e)
        {
            accumulatedLog.add(e.getMessage().trim());
            e.printStackTrace();
        }
//        analyzeLog(processName, accumulatedLog);  //TODO move to particular language block
//        System.out.println("### size of accumulatedLog " + accumulatedLog.size());
//        System.out.println("---------------- Accumulating Log START --------------------------");
//        accumulatedLog.forEach((lineOfLog) -> System.out.println("** " + lineOfLog + " **"));
//        accumulatedLog.forEach(System.out::println);
//        System.out.println("###---------------- Accumulating Log END --------------------------");
        return accumulatedLog;
    }
//    public static List<String> runProcessInDirectoryLogViaFile(String processName, String directoryName, List<String> commandList)
//    {
//        StringBuffer commandLine = new StringBuffer();
////
//        for (String s : commandList)
//        {
//            commandLine.append(s).append(" ");
//        }
//
//        System.out.println("\n### Launch " + processName + ".\nCommand to run: '" + commandLine + "'");
//        List<String> accumulatedLog = new ArrayList<>();
//        try
//        {
//            System.out.println("### Process log:");
//            ProcessBuilder processBuilder = new ProcessBuilder();
//            processBuilder.command(commandList);
//            File dir = new File(directoryName);
//            processBuilder.directory(dir);
//            Process p = processBuilder.start();
//            inheritIO(p.getInputStream(), System.out, accumulatedLog);
//            accumulatedLog = inheritIO(p.getErrorStream(), System.err, accumulatedLog);
//            p.waitFor();
//        }
//        catch (Exception e)
//        {
//            accumulatedLog.add(e.getMessage().trim());
//            e.printStackTrace();
//        }
////        analyzeLog(processName, accumulatedLog);  //TODO move to particular language block
//        System.out.println("### size of accumulatedLog " + accumulatedLog.size());
//        System.out.println("### accumulatedLog START");
//        accumulatedLog.forEach(System.out::println);
//        System.out.println("### accumulatedLog END");
//
//        return accumulatedLog;
//    }

    private static List<String> inheritIO(final InputStream inputStream, final PrintStream dest, final List<String> accumulatedLog)
    {
        new Thread(new Runnable()
        {
            public void run()
            {
                Scanner sc = new Scanner(inputStream);
                while (sc.hasNextLine())
                {
                    String nextLine = sc.nextLine();
                    dest.println(nextLine);
                    accumulatedLog.add(nextLine);
                }
            }
        }).start();
        return accumulatedLog;
    }
    public static synchronized void analyzeLog(String processName, List<String> accumulatedLog)
    {
        if (accumulatedLog == null || accumulatedLog.isEmpty()) {
            return;
        }
//        System.out.println("!!!!!!!!!!! accumulatedLog 1");
//        for(String s : accumulatedLog)
//        {
//            System.out.println(s);
//        }
        String nativeTestErrorLine = "(Fatal\\s+error\\W)+";
        String nativePrefixPassedTestClass = "~Test class passed:";
        String nativePrefixFailedTestClass = "~Test class failed:";
        Pattern nativeTestErrorPattern = Pattern.compile(nativeTestErrorLine);
        Pattern nativePassedTestClassPattern = Pattern.compile(nativePrefixPassedTestClass);
        Pattern nativeFailedTestClassPattern = Pattern.compile(nativePrefixFailedTestClass);

        //analyze
        StringBuffer sb = new StringBuffer();
        String accumulatedString = "";
        boolean failedMessageCameUp = false;
        String failedMessage = null;
        for (String line : accumulatedLog)
        {
            System.out.println("##### line - " + line);
            line = line.trim();
            sb.append(line).append(" ");
            Matcher nativeTestErrorMatcher = nativeTestErrorPattern.matcher(line);
            Matcher nativeFailedTestClassMatcher = nativeFailedTestClassPattern.matcher(line);
            if (nativeFailedTestClassMatcher.find())
            {
                failedMessageCameUp = true;
                failedMessage = line;
            }
            if (nativeTestErrorMatcher.find())
            {
                failedMessageCameUp = true;
                failedMessage = line;
            }

        }
        accumulatedString = sb.toString();

        Matcher nativePassedTestClassMatcher = nativePassedTestClassPattern.matcher(accumulatedString);

        if (nativePassedTestClassMatcher.find())
        {
            System.out.println(processName + ": all tests passed");
            return;
        }
        if (failedMessageCameUp)
        {
            throw new AssertionError(failedMessage);
        }

    }
    public static void runAllScriptsInDirectory(String directoryPathName, String[] command) {
        runAllScriptsInDirectory(directoryPathName, command, null);
    }
    public static void runAllScriptsInDirectory(String directoryPathName, String[] command, String[] excludeFiles) {
        Path directoryPath = Paths.get(directoryPathName);
        if (Files.notExists(directoryPath)) {
            System.out.println("Path '" + directoryPathName + "' is not exist");
            return;
        }
        if (!Files.isDirectory(directoryPath)) {
            System.out.println("Path '" + directoryPathName + "' is not directory");
            return;
        }

        FileFilter fileFilter = new FileFilter() {
            public boolean accept(File file) {
                String extension = FilenameUtils.getExtension(file.getName());
                boolean accepted = file.exists() &&
                        file.isFile() &&
                        !(extension.equalsIgnoreCase("ini") ||
                                extension.equalsIgnoreCase("pytest_cache") ||
                                extension.equalsIgnoreCase("cmd")) &&
                        (file.getName().toLowerCase().contains("test") ||
                                file.getName().toLowerCase().contains("issue") ||
                                file.getName().toLowerCase().contains("barcodephp") ||
                                file.getName().toLowerCase().contains("barcodejava") ||
                                file.getName().toLowerCase().contains("barcodepython") ||
                                file.getName().toLowerCase().contains("barcodejs") ||
                                file.getName().toLowerCase().contains("examples")) &&
                        !(file.getName().toLowerCase().contains("__init__.py") ||
                                file.getName().toLowerCase().contains(".pytest_cache"));
                return accepted;
            }
        };

        File[] files = directoryPath.toFile().listFiles(fileFilter);
        if (files == null || files.length < 1) {
            System.out.println("List of files from directory " + directoryPath + " doesn't contain tests files");
            return;
        }


        List<String> commandsList = new ArrayList<>();
        List<String> commands = Arrays.asList(command);
        commandsList.addAll(commands);

        for (File f : files) {
            String fileName = f.getName();

            if (excludeFiles != null && excludeFiles.length > 0) {
                if (isAnyElementContainsPattern(excludeFiles, fileName)) {
                    continue;
                }
            }
            commandsList.add(fileName);
            System.out.println("~Will be launched: " + f.getName());
            runProcessInDirectory(fileName, directoryPathName, commandsList);
            commandsList.clear();
            commandsList.addAll(commands);
        }
    }
    public static boolean isAnyElementContainsPattern(String[] arrayPatterns, String element) {
        for (String pattern : arrayPatterns) {
            if (element.contains(pattern)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> runCmdFIle(String processName, String directory, String cmdFileName, boolean min, String... args) {
        List<String> command = new ArrayList<>();
        command.add("cmd");
        command.add("/c");
        command.add("start");
        if (min) {
            command.add("/min");
        }
        command.add(cmdFileName);
        command.addAll(Arrays.asList(args));
        return runProcessInDirectory(processName, directory, command);
    }
    public static void runCommand(String command)
    {
        try
        {
            Process process = Runtime.getRuntime().exec(command);
            printResults(process);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void pause(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static List<String> inheritIO(final InputStream src, final PrintStream dest) {
        final List<String> accumulatedLog = new ArrayList<String>();
        new Thread(new Runnable() {
            public void run() {
                Scanner sc = new Scanner(src);
                while (sc.hasNextLine()) {
                    String nextLine = sc.nextLine();
                    dest.println(nextLine);
                    accumulatedLog.add(nextLine);
                }
            }
        }).start();
        return accumulatedLog;
    }

    private static List<String> inheritIOToSystemOut(final InputStream src) {
        final List<String> accumulatedLog = new ArrayList<String>();
        new Thread(new Runnable() {
            public void run() {
                Scanner sc = new Scanner(src);
                while (sc.hasNextLine()) {
                    String nextLine = sc.nextLine();
                    System.out.println(nextLine);
                    accumulatedLog.add(nextLine);
                }
            }
        }).start();
        return accumulatedLog;
    }
}
