package me.ziduye.frame.core.web;

import lombok.AllArgsConstructor;
import lombok.Getter;
import me.ziduye.frame.core.entity.ResultCode;

import javax.servlet.http.HttpServletResponse;

@Getter
@AllArgsConstructor
public enum WebResultCode implements ResultCode {

	/**
	 * 200 - 操作成功
	 */
	SUCCESS(HttpServletResponse.SC_OK, "操作成功"),

	/**
	 * 400 - 业务异常
	 */
	FAILURE(HttpServletResponse.SC_BAD_REQUEST, "业务异常"),

	/**
	 * 400 - 消息不能读取
	 */
	MSG_NOT_READABLE(HttpServletResponse.SC_BAD_REQUEST, "消息不能读取"),

	/**
	 * 400 - 缺少必要的请求参数
	 */
	PARAM_MISS(HttpServletResponse.SC_BAD_REQUEST, "缺少必要的请求参数"),

	/**
	 * 400 - 请求参数类型错误
	 */
	PARAM_TYPE_ERROR(HttpServletResponse.SC_BAD_REQUEST, "请求参数类型错误"),

	/**
	 * 400 - 请求参数绑定错误
	 */
	PARAM_BIND_ERROR(HttpServletResponse.SC_BAD_REQUEST, "请求参数绑定错误"),

	/**
	 * 400 - 参数校验失败
	 */
	PARAM_VALID_ERROR(HttpServletResponse.SC_BAD_REQUEST, "参数校验失败"),

	/**
	 * 401 - 请求未授权
	 */
	UN_AUTHORIZED(HttpServletResponse.SC_UNAUTHORIZED, "请求未授权"),

	/**
	 * 404 没找到请求
	 */
	NOT_FOUND(HttpServletResponse.SC_NOT_FOUND, "404 没找到请求"),

	/**
	 * 405 - 不支持当前请求方法
	 */
	METHOD_NOT_SUPPORTED(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "不支持当前请求方法"),

	/**
	 * 415 - 不支持当前媒体类型
	 */
	MEDIA_TYPE_NOT_SUPPORTED(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, "不支持当前媒体类型"),

	/**
	 * 403 - 请求被拒绝
	 */
	REQ_REJECT(HttpServletResponse.SC_FORBIDDEN, "请求被拒绝"),

	/**
	 * 500 - 服务器异常
	 */
	INTERNAL_SERVER_ERROR(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "服务器异常"),

	;

	/**
	 * code编码
	 */
	final int code;
	/**
	 * 中文信息描述
	 */
	final String message;
}