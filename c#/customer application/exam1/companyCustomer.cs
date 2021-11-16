using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exam1
{
    public class companyCustomer : customer
    {
        public String LicenceNumber, TaxNumber;
        public companyCustomer(String id, String Name, String dob, String a, String g, String LN ,String TN) : base(id, Name, dob, a, g)
        {
            LicenceNumber = LN;
            TaxNumber = TN;
        }
        public override string ReturnStringInfo()
        {
            return "ID " + ID + "\n Name " + Name + "\n Date OF bIRTH" + DateOfBirth + "\n address " + Address + "\n Gender" + Gender + "\n LicenceNUMBER" + LicenceNumber+ "\n TaxNumber" + TaxNumber+ "\n Orders \n" + showOrders() + "\n Total Balance" + ComputeTotalBalance();
        }
    }
}
