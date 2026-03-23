/*
Question 1: The Bulb Festival

In a town, there are n street bulbs initially turned OFF.

On day 1, every bulb is turned ON.
On day 2, every 2nd bulb is toggled.
On day 3, every 3rd bulb is toggled.
This continues until day n.

After n days, how many bulbs remain ON?

👉 Input: n = 50
👉 Output: ?
*/

import java.util.*;
class ToggleBulb
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println((int ) Math.sqrt(n));
    }
}