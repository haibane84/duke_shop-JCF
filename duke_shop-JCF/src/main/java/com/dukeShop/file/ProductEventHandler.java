package com.dukeShop.file;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.dukeShop.model.Product;
import com.dukeShop.service.ProductService;

import jcf.upload.FileInfo;
import jcf.upload.MultiPartInfo;
import jcf.upload.handler.UploadEventHandler;
import jcf.upload.persistence.PersistenceManager;

public class ProductEventHandler implements UploadEventHandler {

	@Autowired
	private ProductService productservice;
	
	public String createFileNameIfAccepted(String folder, FileInfo fileInfo) {
		// TODO Auto-generated method stub
		return UUID.randomUUID().toString();
	}

	public String getFolder(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "product";
	}

	public long getMaxUploadSize() {
		// TODO Auto-generated method stub
		return 100000000;
	}

	public void postprocess(String folder, MultiPartInfo info,
			PersistenceManager persistenceManager) {
		// TODO Auto-generated method stub
		Map<String, Object> attributes = info.getAttributes();
		String pid = (String)attributes.get("pid");
		
		List<FileInfo> fileInfos = info.getFileInfos();
		
		FileInfo fileInfo = fileInfos.get(0);
		
		String callName = fileInfo.getCallName();
		String name = fileInfo.getName();
		System.out.println("PID : "+pid+", Original Name :"+name+", CallName : "+callName);

		Product product = null;
		
//		productservice.insertProduct(product);
		

	}

	public void prepareStorage(PersistenceManager persistenceManager,
			String folder) {
		// TODO Auto-generated method stub
		

	}

}
