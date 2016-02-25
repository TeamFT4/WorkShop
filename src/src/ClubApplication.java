package src;

import java.text.*;

public class ClubApplication {

    public static void main (String args[]) {

        Club club = new Club ();

        club.addMember ("Einstein", "Albert", null);
        club.addMember ("Picasso", "Pablo", "Ruiz");
        club.addMember ("Webber","Andrew","Lloyd");
        club.addMember ("Baggio", "Roberto", null);
        club.addMember ("Raffles", "Stamford", null);

        club.addFacility ("Theatre", null);
        club.addFacility ("Room1", "Conference Room on Level 2");
        club.addFacility ("Room2", "Meeting Room on Level 3");

        club.show ();

        System.out.println ();
        DateFormat df = new SimpleDateFormat (Booking.TIME_FORMAT);

        try {
            club.addBooking (2, "Room1",
			df.parse ("1-Mar-2007 09:00"),
			df.parse ("1-Mar-2007 12:00"));
        } catch (Exception e) {
            System.out.println ("Booking error: " + e.getMessage());
        }
        try {
            club.addBooking (4, "Room1",
			df.parse ("1-Mar-2007 15:00"),
			df.parse ("1-Mar-2007 16:00"));
        } catch (Exception e) {
            System.out.println ("Booking error: " + e.getMessage());
        }
        try {
            club.addBooking (3, "Room1",
			df.parse ("1-Mar-2007 11:00"),
			df.parse ("1-Mar-2007 13:00"));
        } catch (Exception e) {
            System.out.println ("Booking error: " + e.getMessage());
        }

        System.out.println ();
        try {
            club.showBookings ("Room1",
			df.parse ("1-Mar-2007 00:00"),
			df.parse ("2-Mar-2007 00:00"));
        } catch (Exception e) {
            System.out.println (e);
        }
    }

}
