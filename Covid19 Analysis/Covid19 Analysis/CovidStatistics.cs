using System;
using System.Collections.Generic;
using System.Text;

namespace Covid19_Analysis
{
    class CovidStatistics
    {
        private int activeCases { get; set; }
        private int confirmed { get; set; }
        private int deceased { get; set; }
        private int recovered { get; set; }

        public CovidStatistics(int activeCases, int confirmed, int deceased, int recovered)
        {
            this.activeCases = activeCases;
            this.confirmed = confirmed;
            this.deceased = deceased;
            this.recovered = recovered;
        }
    }
}
