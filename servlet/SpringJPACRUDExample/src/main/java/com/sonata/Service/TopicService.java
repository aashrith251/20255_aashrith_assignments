package com.sonata.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sonata.Model.Topic;

@Service
public class TopicService {
	List<Topic>topics=new ArrayList<>(Arrays.asList(new Topic("Spring","Spring lessons","Learn Spring"),
			                                       new Topic("Angular","Angular lessons","Learn Angular"),
			                                       new Topic("React","React lessons","Learn React")
			                                       ));
	public List<Topic>getAllTopics()
	{
		return topics;
	}
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic top)
	{
		topics.add(top);
	}
	public void updateTopic(String id,Topic topics2)
	{
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i,topics2);
				return;
			}
		}
	}
	public void deleteTopic(String id)
	{
		topics.removeIf(t->t.getId().equals(id));
	}
}
