public class SheeshaLyrics {
    public static void main(String[] args) throws Exception {
        
        // 1. Defining the lyrics array based on your image
        String[][] lyrics = {
            {"Aankhya", "Mein", "Bairan"},
            {"Teri", "Hansi", "Ke", "Hansi"},
            {"Jama", "Zeher", "Chhori", "Re"},
            {"Is", "Chhore", "Ke", "Dil", "Pe"},
            {"Dhave", "Keher", "Chhori", "Re"}
        };

        // 2. Defining the timing (in milliseconds)
        int[][] timing = {
            {350, 300, 700}, // Timing for 1st line
            {350, 300, 300, 700}, // Timing for 2nd line... and so on
            {350, 300, 300, 700},
            {350, 300, 300, 320, 700},
            {350, 300, 300, 700}
        };

        // 3. Logic to print the code
        for (int i = 0; i < lyrics.length; i++) {
            for (int j = 0; j < lyrics[i].length; j++) {
                // Print word followed by a space
                System.out.print(lyrics[i][j] + " ");
                
                // Delay based on your timing array
                // We use try-catch or 'throws Exception' for Thread.sleep
                Thread.sleep(timing[i][j]); 
            }
            // Move to the next line after finishing a row
            System.out.println();
        }
    }
}
