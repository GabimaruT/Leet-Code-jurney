class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new LinkedList<>();

        for(int i=0; i<asteroids.length; i++)
        {
            if(asteroids[i] > 0)
            {
                list.add(asteroids[i]);
            }
            else
            {
                boolean distroyed = false;

                while(!list.isEmpty() && list.get(list.size() - 1) > 0)
                {
                    int top = list.getLast();
                    int incoming = asteroids[i];

                    if(top < Math.abs(incoming))
                    {
                        list.removeLast();
                    }
                    else if(top == Math.abs(incoming))
                    {
                        list.removeLast();
                        distroyed = true;
                        break;
                    }
                    else
                    {
                        distroyed = true;
                        break;
                    }
                }
                if(!distroyed)
                {
                    list.add(asteroids[i]);
                }
            }
        }
        
        int res [] = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            res[i] = list.get(i);
        }
        return res;
    }
}