/*捂脸猫FaceCat框架 v1.0
 1.创始人-矿洞程序员-上海宁米科技创始人-脉脉KOL-陶德 (微信号:suade1984);
 2.联合创始人-上海宁米科技创始人-袁立涛(微信号:wx627378127);
 3.联合创始人-河北思尔企业管理咨询有限公司合伙人-肖添龙(微信号:xiaotianlong_luu);
 4.联合开发者-陈晓阳(微信号:chenxiaoyangzxy)，助理-朱炜(微信号:cnnic_zhu);
 5.该框架开源协议为BSD，欢迎对我们的创业活动进行各种支持，欢迎更多开发者加入。
 包含C/C++,Java,C#,iOS,MacOS,Linux六个版本的图形和通讯服务框架。
 */
package facecat.topin.xml;

/**
 * 事件信息
 *
 */
public class FCEventInfo {
    /**
     * 方法
     *
     */
    private java.util.HashMap<Integer, String> m_functions = new java.util.HashMap<Integer, String>();

    /**
     * 添加事件
     *
     * @param eventID 事件ID
     * @param function 方法
     */
    public final void addEvent(int eventID, String function) {
        m_functions.put(eventID, function);
    }

    /**
     * 获取方法
     *
     * @param eventID 事件ID
     * @return 方法
     */
    public final String getFunction(int eventID) {
        if (m_functions.containsKey(eventID)) {
            return m_functions.get(eventID);
        }
        return "";
    }

    /**
     * 移除事件
     *
     * @param eventID 事件ID
     */
    public final void removeEvent(int eventID) {
        if (m_functions.containsKey(eventID)) {
            m_functions.remove(eventID);
        }
    }
}
