// A string is PANAGRAM if it contains all the alphabets in it 
 // for eg: The quick brown fox jumps over the lazy dog is a panagram it can be in upper or lower case

//Use a boolean array for single traversal here i did not use index as reference instead i represented it as char x -the alphabet
boolean isPanagram(String s)
  {
     int n = s.length();
    if(n< 26)
       return false;

    boolean visited[] = new boolean[26];
    for(int i =0;i<n;i++)
      {
        char x = s.charAt(i);
        if(x>="a" && x<="z")
          visited [x-a]=true;
        if(x>="A" && x<="Z")
          visited [x-A]=true;

      }
for(int i=0;i<26;i++)
  {
    if(visited[i] ==false)
      return false

        }
return false;
}
