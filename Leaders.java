static ArrayList<Integer> leaders(int arr[],int n)
  {
     ArrayList result = new ArrayList<>();
    for (int i =0;i<n;i++)
      {
        boolean flag = false;
        for(int j=i+1;j<n;j++)
          {
            if(arr[i]<arr[j])
            {
              flag = true;
              break;
            }
          }
        if(flag == false)
        {
          result.add(arr[i)

       }

        return result;

      }
          
