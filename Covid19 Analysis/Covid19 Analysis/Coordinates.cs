using System;
using System.Collections.Generic;
using System.Text;

namespace Covid19_Analysis
{
    class Coordinates
    {
        private float lat { get; set; }
        private float lon { get; set; }

        public Coordinates(float lat, float lon)
        {
            this.lat = lat;
            this.lon = lon;
        }
    }
}
