class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (String c : operations) {
            if (!c.equals("+") && !c.equals("D") && !c.equals("C")){
                list.add(Integer.parseInt(c));
                if (list.size() > 3) {
                    list.remove(0);
                }
                sum+= list.get(list.size() - 1);
            } else {
                int num = 0;
                boolean isAdd = true;
                switch (c) {
                    case "+":
                        num = list.get(list.size() - 1) + list.get(list.size() - 2);
                        break;
                        case "D":
                        num = list.get(list.size() - 1) * 2;
                        break;
                        case "C":
                        num = list.get(list.size() - 1);
                        isAdd = false;
                        break;
                }
                if (isAdd) {
                    sum+=num;
                    list.add(num);
                } else {
                    sum-=num;
                    list.remove(list.get(list.size() - 1));
                }
            }
        }
        return sum;
    }
}