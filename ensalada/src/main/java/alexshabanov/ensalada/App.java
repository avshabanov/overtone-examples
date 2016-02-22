package alexshabanov.ensalada;

import clojure.lang.RT;

/**
 * Entry point.
 */
public final class App {
  private static final String MAINCLJ = "alexshabanov/ensalada/bridge.clj";

  public static void main(String[] args) {
    System.out.println("Sample app that uses clojure code");

    try {
      RT.loadResourceScript(MAINCLJ);
      RT.var("alexshabanov.ensalada.bridge", "main").invoke(args);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
