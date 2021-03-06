package com.alibaba.tinker.future;
 
import java.util.List; 
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * 负责远程接口的IP的提供
 * 
 * @author yingchao.zyc
 *
 */
public class ProviderAddressFuture { 
	
	private List<String> addressList;
	   
	// countdown数据
	private CountDownLatch countDownLatch = new CountDownLatch(1);

	/**
	 * 数据回写
	 * 
	 * @param responseData
	 */
	public void putResponseData(List<String> addressList) {
		this.addressList = addressList;
		
		// 数据减少，await释放
		countDownLatch.countDown();
	}

	/**
	 * 获取response数据
	 * 
	 * @return
	 */
	public List<String> get() {
		try {
			countDownLatch.await(3000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return addressList;
	}
}
