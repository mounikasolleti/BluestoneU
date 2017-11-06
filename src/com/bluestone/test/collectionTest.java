package com.bluestone.test;

import org.testng.annotations.Test;

import com.bluestone.generic.BaseTest;
import com.bluestone.page.OnlineJewelleryShoppingPage;
import com.bluestone.page.collectionsPage;

public class collectionTest extends BaseTest
{
	@Test
	public void collections() throws InterruptedException
	{
	
	collectionsPage cp=new collectionsPage(driver);
	OnlineJewelleryShoppingPage op= new OnlineJewelleryShoppingPage(driver);
	
	op.verifyTitle("Buy Shards Collection Jewellery Designs  Online in India 2017 | BlueStone");

	
	cp.shardsCollections();
	Thread.sleep(500);
	
	cp.shardsselect();
	
	Thread.sleep(2000);
	
	cp.selectShard1();
	
	Thread.sleep(4000);
	
	cp.buyShard();
	
	Thread.sleep(1000);
	
	op.verifyTitle("Shopping Bag | BlueStone.com");
	
	cp.placeOrder();
	
	cp.selectCountry();
	
	cp.enterPin();
	
	cp.enterAdress();
	
	cp.enterCity();
	
	cp.proceedToBuy();
	
	
	
	}

}
