package org.launchcode.techjobs.oo;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

   @Test
   public void testSettingJobId() {
       Job test_job1 = new Job();
       Job test_job2 = new Job();
       assertNotEquals(test_job1.getId(), test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testFields =
                new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertEquals("Product tester", testFields.getName());
        assertEquals("ACME", testFields.getEmployer().getValue());
        assertEquals("Desert", testFields.getLocation().getValue());
        assertEquals("Quality control", testFields.getPositionType().getValue());
        assertEquals("Persistence", testFields.getCoreCompetency().getValue());
        assertTrue(testFields instanceof Job);
        assertTrue(testFields.getEmployer() instanceof Employer);
        assertTrue(testFields.getLocation() instanceof Location);
        assertTrue(testFields.getPositionType() instanceof PositionType);
        assertTrue(testFields.getCoreCompetency() instanceof CoreCompetency);
        }

        @Test
        public void testJobsForEquality(){
            Job testFields1 =
                    new Job("Product tester",
                            new Employer("ACME"),
                            new Location("Desert"),
                            new PositionType("Quality control"),
                            new CoreCompetency("Persistence"));
            Job testFields2 =
                    new Job("Product tester",
                            new Employer("ACME"),
                            new Location("Desert"),
                            new PositionType("Quality control"),
                            new CoreCompetency("Persistence"));

            assertNotEquals(testFields1, testFields2);
        }

    }






