package controller;

import Repository.CollectingHouseholdProcessRepository;
import java.util.ArrayList;
import java.util.List;

public class CollectingHouseholdProgram {

    List<Integer> lt;
    CollectingHouseholdProcessRepository program;

    public CollectingHouseholdProgram() {
        lt = new ArrayList<Integer>();
        program = new CollectingHouseholdProcessRepository();
    }

    public void run() {
        System.out.println("\t----- Garbage Collection -----");

        program.display(lt);
    }
}