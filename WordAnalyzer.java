/**
 * A class that analyzes words.
 */
public class WordAnalyzer
{
   /**
    * Constructs an analyzer for a given word.
    */
   public WordAnalyzer(String aWord)
   {
      word = aWord;
   }

   /**
    * Gets the first repeated character. 
    */
   public char firstRepeatedCharacter()
   {
      for (int i = 0; i < word.length() - 1; i++)
      {
         char ch = word.charAt(i);
         if (ch == word.charAt(i + 1))
            return ch;
      }
      return 0;
   }

   /**
    * Gets the first multiply occuring character.
    */
   public char firstMultipleCharacter()
   {
      for (int i = 0; i < word.length(); i++)
      {
         char ch = word.charAt(i);
         if (find(ch, i) >= 0)
            return ch;
      }
      return 0;
   }

   private int find(char c, int pos)
   {
      for (int i = pos; i < word.length(); i++)
      {
         if (word.charAt(i) == c) 
         {
            return i;
         }
      }
      return -1;
   }

   /**
    * Counts the groups of repeated characters.
    */
   public int countRepeatedCharacters()
   {
      int c = 0;
      if (word.charAt(0) == word.charAt(1))
      {
          c++;
      }
      for (int i = 1; i < word.length() - 1; i++)
      {
         if (word.charAt(i) == word.charAt(i + 1)) // found a repetition
         {
            if (word.charAt(i - 1) != word.charAt(i)) // it't the start
               c++;
         }
      }     
      return c;
   }

   private String word;
}
