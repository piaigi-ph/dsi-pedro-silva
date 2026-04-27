public class Matematica {
   public Matematica() {
   }

   public static void main(String[] var0) {
      byte var1 = 10;
      short var2 = (short)var1;
      char var3 = (char)var2;
      long var4 = (long)var3;
      float var6 = (float)var4;
      double var7 = (double)var6;
      System.out.println("=== Widening Casting ===");
      System.out.println("byte: " + var1);
      System.out.println("short: " + var2);
      System.out.println("char: " + var3);
      System.out.println("int: " + var3);
      System.out.println("long: " + var4);
      System.out.println("float: " + var6);
      System.out.println("double: " + var7);
      double var9 = 9.78;
      float var11 = (float)var9;
      long var12 = (long)var11;
      int var14 = (int)var12;
      char var15 = (char)var14;
      short var16 = (short)var15;
      byte var17 = (byte)var16;
      System.out.println("\n=== Narrowing Casting ===");
      System.out.println("double: " + var9);
      System.out.println("float: " + var11);
      System.out.println("long: " + var12);
      System.out.println("int: " + var14);
      System.out.println("char: " + var15);
      System.out.println("short: " + var16);
      System.out.println("byte: " + var17);
   }
}
