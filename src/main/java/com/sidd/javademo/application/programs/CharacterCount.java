package com.sidd.javademo.application.programs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class CharacterCount {

    static Logger logger = LoggerFactory.getLogger(CharacterCount.class);
    public static void main(String args[]) throws IOException {

        File file = new File("C:\\TechBase\\SampleProjects\\testdata\\charCount.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String line;

        //Initializing counters
        int wordCount = 0,
            sentenceCount = 0,
            characterCount = 0,
            paragraphCount = 1,
            whitespaceCount = 0;

        //Read the file line by line from the file utill null is returened.
        while((line = reader.readLine()) != null) {
            if(line.equals("")) {
                paragraphCount++;
            }
            if(!(line.equals(""))){
                characterCount += line.length();

                // \\s+ is the space delimiter in java
                String[] wordList = line.split("\\s+");
                wordCount += wordList.length;
                whitespaceCount += wordCount -1;

                // [!?.:]+ is the sentence delimiter

                String[] sentenceList = line.split("[!?.:]+");
                sentenceCount += sentenceList.length;
            }

        }
        logger.info("Total wordCount : "+wordCount);
        logger.info("Total SentenceCount : "+ sentenceCount);
        logger.info("Total Character Count : "+ characterCount);
        logger.info("Total paragraph Count : "+paragraphCount);
        logger.info("Total whitespace count : "+whitespaceCount);


    }
}
