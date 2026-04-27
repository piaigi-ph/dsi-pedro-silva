// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Matematica {
   public Matematica() {
   }

   public static void main(String[] var0) {
      byte var1 = 10;
      short var2 = (short)var1;
      char var3 = (char)var2;
      long var5 = (long)var3;
      float var7 = (float)var5;
      double var8 = (double)var7;
      System.out.println("=== Widening Casting ===");
      System.out.println("byte: " + var1);
      System.out.println("short: " + var2);
      System.out.println("char: " + var3);
      System.out.println("int: " + var3);
      System.out.println("long: " + var5);
      System.out.println("float: " + var7);
      System.out.println("double: " + var8);
      double var10 = 9.78;
      float var12 = (float)var10;
      long var13 = (long)var12;
      int var15 = (int)var13;
      char var16 = (char)var15;
      short var17 = (short)var16;
      byte var18 = (byte)var17;
      System.out.println("\n=== Narrowing Casting ===");
      System.out.println("double: " + var10);
      System.out.println("float: " + var12);
      System.out.println("long: " + var13);
      System.out.println("int: " + var15);
      System.out.println("char: " + var16);
      System.out.println("short: " + var17);
      System.out.println("byte: " + var18);
   }
}


