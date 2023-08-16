package dymanic;

import java.util.ArrayList;
import java.util.List;

public class DynamicFibonacci {
    private List<Integer> list = new ArrayList<>();

    public List<Integer> getList() {
        return list;
    }

    public int calcFibonacci(int n) {

        if (list.size() >= n) {
            return list.get(n);
        }

        if (list.isEmpty()) {
            list.add(0);
            list.add(1);
        }

        while (list.size() < n + 1) {
            int added = list.get(list.size() - 1) + list.get(list.size() - 2);
            list.add(added);
        }

        return list.get(n);
    }
}