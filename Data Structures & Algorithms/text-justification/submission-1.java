class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int currentLineLength = 0;
        int i = 0;
        String line = "";

        while( i < words.length){
            if (currentLineLength + currentLine.size() + words[i].length() > maxWidth){
                // Line complete
                int extraSpace = maxWidth - currentLineLength;

                int spaces = extraSpace / Math.max(1,currentLine.size() - 1) ;
                int remainder = extraSpace % Math.max(1,currentLine.size() - 1);

                if (currentLine.size() == 1 ){
                    line = currentLine.get(0);
                    while (line.length() < maxWidth) {
                    line += " ";
                    }
                    res.add(line);
                    line = "";
                    currentLine.clear();
                    currentLineLength = 0;
                    continue;   
                }
                
                for (int j = 0; j < currentLine.size()-1; j++){
                    line += currentLine.get(j);
                    for (int k = 0; k < spaces; k++){
                        line += " " ;
                    }
                    
                    if (remainder > 0){
                        line += " ";
                        remainder -= 1;
                    }
                }
                line += currentLine.get(currentLine.size()-1);
                res.add(line);
                line = "";
                currentLine = new ArrayList<>();
                currentLineLength = 0;
            }
            currentLine.add(words[i]);
            currentLineLength += words[i].length();
            i += 1;

        }
        // Handling last line
        line = String.join(" ", currentLine);
        int trail_space = maxWidth - line.length();

        for(int z = 0; z < trail_space; z++){
            line += " ";
        }
        res.add(line);

        return res;
    }
}