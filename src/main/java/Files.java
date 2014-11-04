import java.io.File;

public class Files {
  public void prettyPrint(File f, boolean includeSubDirs, final int tabs) {
    if (f == null) {
      return;
    }

    System.out.println(tabs(tabs) + f.toString());

    File[] files = f.listFiles();
    if (files != null) {
      for (File file : files) {
        prettyPrint(file, false, tabs + 1);

        if (f.isDirectory()) {
          System.out.println("/");
          if (includeSubDirs) {
            prettyPrint(file, true, tabs + 1);
          }
        }
      }
    }
  }

  private String tabs(int tabs) {
    StringBuilder build = new StringBuilder();
    for (int i = 0; i < tabs; i++) {
      build.append("\t");
    }

    return build.toString();
  }

  public static void main(String... args) {
    // Fill-out with test
  }
}
