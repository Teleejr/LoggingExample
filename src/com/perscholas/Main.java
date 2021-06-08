package com.perscholas;

import java.io.IOException;
import java.util.logging.*;

public class Main {

    public static void main(String[] args) throws IOException {

        final Logger logger = Logger.getLogger(Main.class.getName());
        logger.setUseParentHandlers(false);

        //Root level - It doesn't matter what the handler level is set to, it will only show INFO and above
        logger.setLevel(Level.INFO);
        Handler consoleHandler = new ConsoleHandler();

        //Handler level
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);

        //Handler level
        Handler fileHanlder = new FileHandler("logging.txt");
        fileHanlder.setFormatter(new SimpleFormatter());
        fileHanlder.setLevel(Level.ALL);
        logger.addHandler(fileHanlder);

        logger.log(Level.SEVERE, "SEVERE");
        logger.log(Level.WARNING, "WARNING");
        logger.log(Level.INFO, "INFO");
        logger.log(Level.CONFIG, "CONFIG");
        logger.log(Level.FINE, "FINE");
        logger.log(Level.FINER, "FINER");
        logger.log(Level.FINEST, "FINEST");

    }



}
