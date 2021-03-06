package co.tripp.farrapp.api.data.model;



public class Party {
    private Integer id;
    private String partyName;
    private String description;
    private String eventDate;
    private String eventHour;
    private String address;
    private String place;
    private Integer price;
    private String optionalDescription;
    private String typeOfMusic;
    private User[] assistants;


    public Party(){}

    public Party(String partyName, String description, String eventDate, String eventHour, String address, String place, Integer price, String optionalDescription, String typeOfMusic, User[] assistants) {
        this.partyName = partyName;
        this.description = description;
        this.eventDate = eventDate;
        this.eventHour = eventHour;
        this.address = address;
        this.place = place;
        this.price = price;
        this.optionalDescription = optionalDescription;
        this.typeOfMusic = typeOfMusic;
        this.assistants = assistants;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventHour() {
        return eventHour;
    }

    public void setEventHour(String eventHour) {
        this.eventHour = eventHour;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getOptionalDescription() {
        return optionalDescription;
    }

    public void setOptionalDescription(String optionalDescription) {
        this.optionalDescription = optionalDescription;
    }

    public String getTypeOfMusic() {
        return typeOfMusic;
    }

    public void setTypeOfMusic(String typeOfMusic) {
        this.typeOfMusic = typeOfMusic;
    }

    public User[] getAssistants() {
        return assistants;
    }

    public void setAssistants(User[] assistants) {
        this.assistants = assistants;
    }

    public void addAssistant(User user){
        this.assistants[this.assistants.length]= user;
    }
}
