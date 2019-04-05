package FacablePattern.Demo1;

/**
 *外观模式是一种使用频率非常高的结构型设计模式，
 * 它通过引入一个外观角色来简化客户端与子系统之间的交互，
 * 为复杂的子系统调用提供一个统一的入口，
 * 降低子系统与客户端的耦合度，且客户端调用非常方便。
 */

public class FaceMain {
    public static void main(String[] args) {
        FaceMaker faceMaker = new FaceMaker();
        faceMaker.AA();
        faceMaker.BB();
        faceMaker.CC();
    }

}
