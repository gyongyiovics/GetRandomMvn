package util;

import config.ConfigReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FILEReader {
    public static String read() {
        List<String> devices = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ConfigReader.getDevicesPath()))) {
            for(String line; (line = br.readLine()) != null;) {
                //System.out.println(line);
                return line;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
