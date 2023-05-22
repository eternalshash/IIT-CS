package lab_Ten;

class RunnerClient {
    public static void main(String[] args) {
            //Runner r1 = new Runner("Bikila", 2, 15, 0);
            //System.out.println(r1.getName()+" Time in Seconds: "+r1.getSeconds()+" Percentage Slower: "+r1.percentageSlower() + "%");
            
            Runner r2 = new Runner("Gomez", 4, 29, 54);
            System.out.println(r2.getName()+" Time in Seconds: "+r2.getSeconds()+" Percentage Slower: "+r2.percentageSlower() + "%");

            Runner r3 = new Runner("Radcliffe", "2:15:25");
            System.out.println(r3.getName()+" Time in Seconds: "+r3.getSeconds()+" Percentage Slower: "+r3.percentageSlower() + "%");

            // add code here to test more  [2 pt]

    }

}

