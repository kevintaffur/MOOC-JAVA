package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        try {
            Scanner fr = new Scanner(Paths.get(this.file));
            while (fr.hasNextLine()) {
                String line = fr.nextLine();
                String[] parts = line.split(":");
                this.dictionary.put(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter pw = new PrintWriter(this.file);
            for (String str : this.dictionary.keySet()) {
                pw.println(str + ":" + this.dictionary.get(str));
            }
            pw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public void add(String word, String translation) {
        if (this.dictionary.containsKey(word)) {
            return;
        }
        this.dictionary.put(word, translation);
    }
    
    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else {
            for (String str : this.dictionary.keySet()) {
                if (this.dictionary.get(str).equals(word)) {
                    return str;
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        } else {
            for (String str : this.dictionary.keySet()) {
                if (this.dictionary.get(str).equals(word)) {
                    this.dictionary.remove(str);
                    return;
                }
            }
        }
    }
}
