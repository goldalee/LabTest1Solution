//Solution to Lab Test 1
//This had inheritance and one composition relationship
public class LabTest1 {

    public class ArmForce{
        protected int forceId;
        protected String officerName;
        protected Rank rankId = new Rank();
        protected float salary;



        public ArmForce(){
            forceId =0;
            officerName ="";
            rankId.setRankLevel(0);
            salary = 0;

        }

        public ArmForce(int forceId, String officerName, Rank rankId, float salary){
            this.forceId = forceId;
            this.officerName=officerName;
            this.rankId= rankId;
            this.salary = salary;

        }

        public ArmForce(ArmForce armForce){
            rankId = armForce.rankId;
            officerName=armForce.officerName;
            forceId=armForce.forceId;
            salary=armForce.salary;

        }

        public int getForceId() {
            return forceId;
        }

        public void setForceId(int forceId) {
            this.forceId = forceId;
        }

        public String getOfficerName() {
            return officerName;
        }

        public void setOfficerName(String officerName) {
            this.officerName = officerName;
        }

        public Rank getRankId() {
            return rankId;
        }

        public void setRankId(Rank rankId) {
            this.rankId = rankId;
        }

        public float getSalary() {
            return salary;
        }

        public void setSalary(float salary) {
            this.salary = salary;
        }


        public void Display() {
            System.out.println("ArmForce{" +
                    "forceId=" + forceId +
                    ", officerName='" + officerName + '\'' +
                    ", rankId=" + rankId +
                    ", salary=" + salary +
                    '}');
        }
    }

    public static class Rank{
        private String rankName;
        private int rankLevel;

        //default constructor
        public Rank(){
            rankName = "";
            rankLevel = 0;
        }

        //default constructor
        public Rank (String rankName, int rankLevel){
            this.rankLevel=rankLevel;
            this.rankName=rankName;
        }

        //copy constructor
        public Rank(Rank rank){
            rankName = rank.rankName;
            rankLevel = rank.rankLevel;
        }


        public String getRankName(){
            return rankName;
        }

        public void setRankName(String rankName){
            this.rankName=rankName;
        }

        public int getRankLevel(){
            return rankLevel;
        }

        public void setRankLevel(int rankLevel){
            this.rankLevel= rankLevel;
        }

        public void Display(){
            System.out.println("Rank Name: "+ this.rankName + "Rank Level: " + this.rankLevel + "\n");
        }
    }

    public class Police extends ArmForce{
        private int stationId;
        private String squadName;
        private String stationLocation;

        //default constructor
        public Police(){
            stationId = 0;
            squadName="";
            stationLocation="";
        }


        //primary constructor
        public Police(int forceId, String officerName, Rank rankId, float salary,int stationId, String squadName, String stationLocation){
            super(forceId, officerName, rankId, salary);
            this.squadName = squadName;
            this.stationLocation= stationLocation;
            this.stationId = stationId;



        }

        //copy constructor
        public Police(Police police){
            super(police.forceId, police.officerName, police.rankId, police.salary);
            stationId = police.stationId;
            stationLocation = police.stationLocation;
            squadName = police.squadName;

        }

        public int getStationId() {
            return stationId;
        }

        public void setStationId(int stationId) {
            this.stationId = stationId;
        }

        public String getSquadName() {
            return squadName;
        }

        public void setSquadName(String squadName) {
            this.squadName = squadName;
        }

        public String getStationLocation() {
            return stationLocation;
        }

        public void setStationLocation(String stationLocation) {
            this.stationLocation = stationLocation;
        }

        public void Display() {
            System.out.println("Police{" +
                    "stationId=" + stationId +
                    ", squadName='" + squadName + '\'' +
                    ", stationLocation='" + stationLocation + '\'' +
                    ", forceId=" + forceId +
                    ", officerName='" + officerName + '\'' +
                    ", rankId=" + rankId +
                    ", salary=" + salary +
                    '}');
        }

    }

    public class Soldier extends ArmForce{

        private String duty;
        private String deploymentLocation;


        //default constructor
        public Soldier(){
            duty="";
            deploymentLocation="";
        }

        //primary constructor
        public Soldier(int forceId, String officerName, Rank rankId, float salary,String duty, String deploymentLocation){
            super(forceId, officerName, rankId, salary);
            this.deploymentLocation=deploymentLocation;
            this.duty=duty;

        }
        //copy constructor
        public Soldier(Soldier soldier){
            super(soldier.forceId, soldier.officerName, soldier.rankId, soldier.salary);
            deploymentLocation = soldier.deploymentLocation;
            duty = soldier.duty;
        }

        public String getDuty() {
            return duty;
        }

        public void setDuty(String duty) {
            this.duty = duty;
        }

        public String getDeploymentLocation() {
            return deploymentLocation;
        }

        public void setDeploymentLocation(String deploymentLocation) {
            this.deploymentLocation = deploymentLocation;
        }


        public void Display() {
            System.out.println("Soldier{" +
                    "duty='" + duty + '\'' +
                    ", deploymentLocation='" + deploymentLocation + '\'' +
                    ", forceId=" + forceId +
                    ", officerName='" + officerName + '\'' +
                    ", rankId=" + rankId +
                    ", salary=" + salary +
                    '}');
        }
    }
    public static void main(String[] args){

        LabTest1 labTest1 = new LabTest1();
        LabTest1.ArmForce armForce1 = labTest1.new ArmForce();
        LabTest1.ArmForce armForce2 = labTest1.new ArmForce(6, "John Smith", new LabTest1.Rank(), 213982);
        LabTest1.ArmForce armForce3 = labTest1.new ArmForce(armForce2);


       /* ArmForce armForce1 = new ArmForce();
        ArmForce armForce2 = new ArmForce(6, "John Smith",3,213982);
        ArmForce armForce3 = new ArmForce();*/

        armForce1.Display();
        armForce2.Display();
        armForce3.Display();

        armForce3.setRankId(new Rank("Captain", 3));
        armForce3.setSalary(450000);
        armForce3.Display();


        LabTest1.Police police1 = labTest1.new Police();
        LabTest1.Police police2 = labTest1.new Police(4, "Paul Smith", new LabTest1.Rank(), 350, 003, "Operations", "St. Ann's Bay");

        police1.Display();
        police2.Display();


        LabTest1.Soldier soldier1 = labTest1.new Soldier(2, "Laren Tarea", new LabTest1.Rank(), 350,"Zoso", "St. James");
        LabTest1.Soldier soldier2 = labTest1.new Soldier(soldier1);

        soldier1.Display();
        soldier2.Display();




    }
}
