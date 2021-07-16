package jc.java9.safevarargs;

import java.util.List;

public class SafeVaragrsEnhancementDemo {

    @SafeVarargs
   public static void m1(List<String>... l){

   }

   @SafeVarargs
   public final void m2(List<String>... l){

   }

   @SafeVarargs   // Allowed as part of 1.9 enhancement
   private void m3(List<String>... l) {

   }

}
