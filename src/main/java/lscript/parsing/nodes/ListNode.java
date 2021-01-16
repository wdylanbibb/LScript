package lscript.parsing.nodes;

import lscript.lexing.Position;

import java.util.List;

/**
 * A simple Node representing a list (used for both language lists and multiline statements).
 */
public class ListNode extends Node {

    private final List<Node> nodes;

    public ListNode(List<Node> nodes, Position posStart, Position posEnd) {
        super(posStart, posEnd);
        this.nodes = nodes;
    }

    /**
     * @return a List of Nodes contained in the list.
     */
    public List<Node> getNodes() {
        return nodes;
    }
}
