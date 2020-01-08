package me.ziduye.frame.core.persist.tree.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import me.ziduye.frame.core.persist.data.entity.DataEntity;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
public class TreeEntity<T> extends DataEntity<T> {

	protected String name; 		// 名称
	protected Integer sortNo;	// 排序

	protected String parentId;  //父级编号
	protected T parent;			// 父节点

	protected String parentIds; // 所有父级编号

	protected List<T> children;

}
