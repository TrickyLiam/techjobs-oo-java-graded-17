package org.launchcode.techjobs.oo;

public class Main {

    public static void main(String[] args) {
//        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
//
//        ArrayList<Job> jobs = new ArrayList<>();
//        jobs.add(job1);
//        jobs.add(job2);
//        jobs.add(job3);
//
//        for (Job job : jobs){
//            System.out.println(job);
//        }
        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        System.out.println(testJob.toString());

        Job testJob2 = new Job("Product ",
                new Employer("hershey"),
                new Location("water"),
                new PositionType("Quality "),
                new CoreCompetency("partying"));
        System.out.println(testJob2.toString());
//        Employer Walmart = new Employer();
//        System.out.println(Walmart.getValue());
    }


}
