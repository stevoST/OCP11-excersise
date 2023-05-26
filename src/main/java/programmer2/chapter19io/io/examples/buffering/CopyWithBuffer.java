package programmer2.chapter19io.io.examples.buffering;

import java.io.*;

public class CopyWithBuffer {
    public static void main(String[] args) throws IOException {
        var file = new FileWriter("inputBuffer.txt");
        for (int i = 0; i < 5000; i++) {
        file.write(90);
        }
        file.close();

        new CopyWithBuffer().copyFileWithBuffer(new File("inputBuffer.txt"), new File("outputBuffer.txt"));
    }

    void copyFileWithBuffer(File src, File dest) throws IOException {
        try (var in = new BufferedInputStream(
                new FileInputStream(src));
             var out = new BufferedOutputStream(
                     new FileOutputStream(dest))) {
            var buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
    }
}
