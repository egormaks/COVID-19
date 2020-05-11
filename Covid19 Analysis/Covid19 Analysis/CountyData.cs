using System;
using System.Collections.Generic;
using System.Text;

namespace Covid19_Analysis
{
    class CountyData
    {
        private String countyName { get; set; }
        private CovidStatistics statistics { get; set; }
        private Coordinates countyCoords { get; set; }

        public CountyData(String countyName, CovidStatistics statistics, Coordinates countyCoords)
        {
            this.countyName = countyName;
            this.countyCoords = countyCoords;
            this.statistics = statistics;
        }

    }
}
