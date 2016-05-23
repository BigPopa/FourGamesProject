public class Card
	{
		String suit;
		String rank;
		int value;		
		public Card (String s, String r, int n)
		{
			suit=s;
			rank=r;
			value=n;	
		}
		public String getSuit()
			{
				return suit;
			}


		public void setSuit(String suit)
			{
				this.suit = suit;
			}


		public String getRank()
			{
				return rank;
			}


		public void setRank(String rank)
			{
				this.rank = rank;
			}


		public int getValue()
			{
				return value;
			}


		public void setValue(int value)
			{
				this.value = value;
			}
	}

