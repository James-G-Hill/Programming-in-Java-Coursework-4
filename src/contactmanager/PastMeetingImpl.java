package contactmanager;

import interfaces.Contact;
import java.util.Calendar;
import java.util.Set;

/**
 * This is an implementation of the 'PastMeeting' class.
 *
 * @author James
 */
public class PastMeetingImpl extends MeetingImpl {
    
    /**
     * This String is the notes for the meeting.
     */
    private String meetingNotes = "";
    
    /**
     * This is the class constructor.
     * 
     * @param meetingID a unique ID for this meeting.
     * @param meetingContacts a list of attendees for the meeting.
     * @param meetingDate the date at which the meeting takes place.
     */
    public PastMeetingImpl(int meetingID, Set<Contact> meetingContacts, Calendar meetingDate) {
        super(meetingID, meetingContacts, meetingDate);
    }
    
}