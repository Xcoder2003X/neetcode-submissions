class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int n = position.length;
        if (n == 0) return 0;

        int[][] cars = new int[n][2];

        for(int i=0 ; i<n ; i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Hint 3 : Calculer le temps nécessaire pour atteindre la cible (cast en double indispensable)
            double time = (double) (target - cars[i][0]) / cars[i][1];

            // Hint 4 : Si la voiture actuelle met plus de temps que la flotte devant elle (stack.peek()),
            // elle ne la rattrapera jamais et crée donc une nouvelle flotte.
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
            // Si time <= stack.peek(), elle rattrape la flotte devant elle et adopte sa vitesse (on ne fait rien).
        }

        return stack.size();
    }
}
