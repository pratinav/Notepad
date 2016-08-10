import java.io.*;

/**
 * File IO Handling library
 */
public class IO {
  /**
   * Returns file contents
   * @param path  path of file
   * @return    String with file data
   */
  public static String read(String path) {
    String data = "";
    try {
      BufferedReader f = new BufferedReader(new FileReader(path));
      String currentLine;
      String nextLine = f.readLine();
      if (nextLine != null) while (true) {
          currentLine = nextLine;
          nextLine = f.readLine();
          data += currentLine;
          if (nextLine == null) break;
          else data += "\n";
      }
      f.close();
    } catch(IOException e) {}
    return data;
  }

  /**
   * Writes string to file, without appending by default
   * @param path  path of file
   * @param data  data to write
   */
  public static void write(String path, String data) {
    try {
      PrintWriter f = new PrintWriter(new FileWriter(path));
      f.println(data);
      f.close();
    } catch (IOException e) {}
  }
}
