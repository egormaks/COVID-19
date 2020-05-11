using System;
using System.Collections.Generic;
using System.Text;

namespace Covid19_Analysis
{
    class Timestamp
    {
        private int month { get; set; }
        private int day { get; set; }
        private int year { get; set; }

        public Timestamp(int month, int day, int year)
        {
            if (month < 0 || month > 12)
            {
                throw new IllegalDateException("Invalid month");
            }
            if (day < 0 || day > 31)
            {
                throw new IllegalDateException("Invalid day");
            }
            this.month = month;
            this.day = day;
            this.year = year;
        }

        public void Increment()
        {
            if (day + 1 > 31)
            {
                day = 1;
                if (month + 1 > 12)
                {
                    month = 1;
                    year++;
                }
                else
                {
                    month++;
                }
            }
            else day++;
        }
    }
}
public class IllegalDateException : Exception
{
    public IllegalDateException(string message) : base(message) { }
}