package Core;

import Utils.File;
import Utils.Messages;

public class Huffman extends File {
    public void run(String[] args) {
        if (args.length == 0) {
            System.out.println(Messages.helpMessage);
            return;
        }

        if (args.length == 1) {
            System.out.println(Messages.specifyPath);
            return;
        }

        byte[] fileData = File.readFile(args[1]);
        if (fileData == null) {
            return;
        }


        switch (args[0]) {
            case "-c":
            case "--compress":
//                Compression.compress(fileData, "Files/output");
                break;

            case "-d":
            case "--decompress":
//                Decompression.decompress(fileData, "Files/decompressed.txt");
                break;

            default:
                System.out.println(Messages.invalidOption);
                break;
        }
    }
}

