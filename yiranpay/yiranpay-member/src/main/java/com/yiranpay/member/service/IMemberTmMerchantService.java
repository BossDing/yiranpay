package com.yiranpay.member.service;

import com.yiranpay.member.domain.MemberTmMerchant;
import com.yiranpay.member.exception.MaBizException;

import java.util.List;

/**
 * 商户 服务层
 * 
 * @author yiran
 * @date 2019-03-30
 */
public interface IMemberTmMerchantService 
{
	/**
     * 查询商户信息
     * 
     * @param merchantId 商户ID
     * @return 商户信息
     */
	public MemberTmMerchant selectMemberTmMerchantById(String merchantId);
	
	/**
     * 查询商户列表
     * 
     * @param memberTmMerchant 商户信息
     * @return 商户集合
     */
	public List<MemberTmMerchant> selectMemberTmMerchantList(MemberTmMerchant memberTmMerchant);
	
	/**
     * 新增商户
     * 
     * @param memberTmMerchant 商户信息
     * @return 结果
     */
	public int insertMemberTmMerchant(MemberTmMerchant memberTmMerchant);
	
	/**
     * 修改商户
     * 
     * @param memberTmMerchant 商户信息
     * @return 结果
     */
	public int updateMemberTmMerchant(MemberTmMerchant memberTmMerchant);
		
	/**
     * 删除商户信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMemberTmMerchantByIds(String ids);

	/**
	 * 查询商户集合信息
	 * @param memberId
	 * @return
	 */
	public List<MemberTmMerchant> queryByMemberId(String memberId) throws MaBizException;

	/**
	 * 添加商户信息
	 * @param merchant
	 * @return
	 */
	public String createMerchant(MemberTmMerchant merchant);

	
}
