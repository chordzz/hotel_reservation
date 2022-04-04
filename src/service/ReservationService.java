package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationService {
    public static List<IRoom> rooms = new ArrayList<IRoom>();
    public static List<Reservation> reservedRooms = new ArrayList<Reservation>();

    public ReservationService(){

    }

    public void addRoom(IRoom room) {
        rooms.add(room);
    }

    public IRoom getARoom(String roomId) {
        for(IRoom room : rooms){
            if(room.getRoomNumber() == roomId){
                return room;
            }
        }
        return null;
    }

    public Reservation reserveRoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        return new Reservation(customer, room, checkInDate, checkOutDate);
    }
}
