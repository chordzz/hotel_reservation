package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class ReservationService {
    public static List<IRoom> rooms = new ArrayList<IRoom>();
    public static List<Reservation> reservedRooms = new ArrayList<Reservation>();


    public static void addRoom(IRoom room) {
        rooms.add(room);
    }

    public static IRoom getARoom(String roomId) {
        for(IRoom room : rooms){
            if(room.getRoomNumber() == roomId){
                return room;
            }
        }
        return null;
    }

    public static Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);
        reservedRooms.add(reservation);
        
        return reservation;
    }

    public static Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        List<IRoom> foundRooms = new ArrayList<IRoom>();
        for(Reservation reservation : reservedRooms){
            if (reservation.checkInDate.compareTo(checkInDate) == 0 && reservation.checkOutDate.compareTo(checkOutDate) == 0){
                foundRooms.add(reservation.room);
            }
        }

        return foundRooms;
    }

    public static Collection<Reservation> getCustomersReservation(Customer customer) {
        List<Reservation> customerReservation = new ArrayList<>();

        for(Reservation reservation : reservedRooms) {
            if(reservation.customer == customer){
                customerReservation.add(reservation);
            }
        }

        return customerReservation;
    }

    public static void printAllReservation(){
        while(reservedRooms.iterator().hasNext()){
            System.out.println(reservedRooms.iterator().next());
        }
    }
}
