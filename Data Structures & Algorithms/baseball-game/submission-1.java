class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        for (String c : operations) {
            if (!c.equals("+") && !c.equals("D") && !c.equals("C")) {
                int num = Integer.parseInt(c);
                list.add(num);
                sum += num;
            } else {
                int last = list.get(list.size() - 1);

                switch (c) {
                    case "+":
                        int secondLast = list.get(list.size() - 2);
                        int num = last + secondLast;
                        list.add(num);
                        sum += num;
                        break;

                    case "D":
                        num = last * 2;
                        list.add(num);
                        sum += num;
                        break;

                    case "C":
                        list.remove(list.size() - 1);
                        sum -= last;
                        break;
                }
            }
        }

        return sum;
    }
}