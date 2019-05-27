package java_basic.object_and_classes;

public class Time{
	
	private int hours;
	private int minutes;
	private int seconds;

   Time() {
      hours = 0;
      setMinutes(0);
      setSeconds(0);
   }

   Time(int h, int m, int s) {
      if (h < 0 || h > 23)
        hours = 0;
      else
        hours = h;
      if (m < 0 || m > 60)
         setMinutes(0);
      else
         setMinutes(m);
      if (s < 0 || s > 60)
         setSeconds(0);
      else
         setSeconds(s);
   }

   Time(int h, int m) {
      hours = h;
      setMinutes(m);
      setSeconds(0);
   }

   public int getMinutes() {
	return minutes;
}

public void setMinutes(int minutes) {
	this.minutes = minutes;
}

public int getSeconds() {
	return seconds;
}

public void setSeconds(int seconds) {
	this.seconds = seconds;
}

public String toString() {
      return "Hours: " + hours + "\n" +
             "Minutes: " + getMinutes() + "\n" +
             "Seconds: " + getSeconds();
   }

   public String display() {
      String hrs, mins, secs;
      if (hours < 10)
         hrs = "0" + hours;
      else
         hrs = hours + "";
      if (getMinutes() < 10)
         mins = "0" + getMinutes();
      else
         mins = getMinutes() + "";
      if (getSeconds() < 10)
         secs = "0" + getSeconds();
      else
         secs = getSeconds() + "";
      return hrs + ":" + mins + ":" + secs;
   }

   public void setTime(int h, int m, int s) {
      if (h < 0 || h > 23)
        hours = 0;
      else
        hours = h;
      if (m < 0 || m > 60)
         setMinutes(0);
      else
         setMinutes(m);
      if (s < 0 || s > 60)
         setSeconds(0);
      else
         setSeconds(s);
   }

   public void setHours(int h) {
       if (h < 0 || h > 23)
        hours = 0;
      else
        hours = h;
   }

   public int getHours() {
      return hours;
   }

   public void increment(int amount) {
      setMinutes(getMinutes() + amount);
      if (getMinutes() > 59) {
         ++hours;
         setMinutes(getMinutes() - 60);
      }
   }

   public boolean equals(Time t1) {
      int tseconds = (hours * 60 * 60) + (getMinutes() * 60) + getSeconds();
      int t1seconds = (t1.hours * 60 * 60) + (t1.getMinutes() * 60) + t1.getSeconds();
      if (tseconds == t1seconds)
         return true;
      else 
         return false;
   }
}