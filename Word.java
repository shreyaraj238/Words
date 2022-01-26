public class Word
{
   private String text;

   /**
      Constructs a word.
      @param text the characters in this word
   */
   public Word(String text)
   {
      this.text = text;
   }

   /**
      Tests whether a letter is a vowel
      @param letter a string of length 1
      @return true if letter is a vowel
    */
   public boolean isVowel(String letter)
   {
      return "aeiouy".contains(letter.toLowerCase());
   }

   public int countVowels()
   {
      int i = 0;
      int counter = 0;
      while (i < text.length())
      {
         String letter = text.substring(i, i + 1); // the ith letter
         // Your work here
         this.isVowel(letter);
         if(isVowel(letter))
         {
             counter++;
             i++;
         }
         else
         {
             i++;
         }

      }
      return counter;
   }

   public int countVowelGroups()
   {
      // Your work here
      int i = 0;
      int count = 0;
      while(i < text.length())
      { 
          if (isVowel(text.substring(i, i + 1)))
          {
              count++;
              while(i < text.length() && isVowel(text.substring(i, i + 1)))
              {
                  i++;
              }
          }
          i++;
      }
      return count;
   }
   
   public String toString()
   {
      return text;
   }
}