package core.basesyntax;

public enum Colors {
      black,
      white,
      red,
      blue;
    
      // this method returns a String object and with the name() method we get the name of the color
      public String getColor() {
            return this.name();
      }
}
