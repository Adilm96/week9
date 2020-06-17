import java.io.*;

public class Alice {

    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\Adil\\Desktop\\ansøgning.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;

        // Initialisere tæller
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;



        // Læser linie for linie i
        // filen indtil null er returned
        while((line = reader.readLine()) != null)
        {
            if(line.equals(""))
            {

            } else {
                characterCount += line.length();

                // \\s+ er space delimiter i java
                String[] wordList = line.split("\\s+");

                countWord += wordList.length;


                // [!?.:]+ er sentence delimiter i java
                String[] sentenceList = line.split("[!?.:]+");

                sentenceCount += sentenceList.length;
            }
        }

        System.out.println("Total antal ord = " + countWord);
        System.out.println("Total antal sætninger= " + sentenceCount);
        System.out.println("Total antal bogstaver = " + characterCount);

    }
}


